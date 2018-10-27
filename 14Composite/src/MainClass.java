import java.util.List;


public class MainClass {
	public static void main(String[] args) {
		//C盘
		Folder rootFolder = new Folder("C:");
		//beifeng目录
		Folder beifengFolder = new Folder("beifeng");
		//beifeng.txt文件
		File beifengFile = new File("beifeng.txt");
		
		rootFolder.add(beifengFolder);
		rootFolder.add(beifengFile);
		
		//ibeifeng目录
		Folder ibeifengFolder = new Folder("ibeifeng");
		File ibeifengFile = new File("ibeifeng.txt");
		beifengFolder.add(ibeifengFolder);
		beifengFolder.add(ibeifengFile);
		
		Folder iibeifengFolder = new Folder("iibeifeng");
		File iibeifengFile = new File("iibeifeng.txt");
		ibeifengFolder.add(iibeifengFolder);
		ibeifengFolder.add(iibeifengFile);
		
		displayTree(rootFolder,0);
		
	}
	
	public static void displayTree(IFile rootFolder, int deep) {
		for(int i = 0; i < deep; i++) {
			System.out.print("--");
		}
		//显示自身的名称
		rootFolder.display();
		//获得子树
		List<IFile> children = rootFolder.getChild();
		//遍历子树
		for(IFile file : children) {
			if(file instanceof File) {
				for(int i = 0; i <= deep; i++) {
					System.out.print("--");
				}
				file.display();
			} else {
				displayTree(file,deep + 1);
			}
		}
	}
}
