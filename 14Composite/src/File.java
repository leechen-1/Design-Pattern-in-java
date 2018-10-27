import java.util.List;


public class File implements IFile {
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	

	public void display() {
		System.out.println(name);
	}

	public List<IFile> getChild() {
		return null;
	}


	public boolean add(IFile file) {
		return false;
	}

	public boolean remove(IFile file) {
		return false;
	}

}
