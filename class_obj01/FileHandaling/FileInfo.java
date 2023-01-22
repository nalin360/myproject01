import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        /*
         toString	            /home/joe/foo	    C:\home\joe\foo     	Returns the string representation of the Path.
                                                                            If the path was created using
                                                                            Filesystems.getDefault().getPath(String)
                                                                            or Paths.get (the latter is a convenience
                                                                            method for getPath),
                                                                            the method performs minor syntactic cleanup.
                                                                            For example,
                                                                            in a UNIX operating system, it will correct the input string
                                                                            //home/joe/foo to /home/joe/foo.

            getFileName	        foo	                foo	                    Returns the file name or the last
            *                                                               element of the sequence of name elements.
            *
            getName(0)	        home	            home	                Returns the path element corresponding to the
            *                                                               specified index. The 0th element is the path element
            *                                                               closest to the root.
            getNameCount	    3	                3	                    Returns the number of elements in the path.
            *
            subpath(0,2)	    home/joe	        home\joe	            Returns the subsequence of the Path
            *                                                               (not including a root element) as specified
            *                                                               by the beginning and ending indexes.
            *
            getParent	        /home/joe	        \home\joe	            Returns the path of the parent directory.
            *
            getRoot	            /	                C:\	                    Returns the root of the path.
        * */

        File myObj = new File("C:\\Users\\admin\\IdeaProjects\\myproject01\\NewfileHandaling.txt");
        if (myObj.exists()) {
            // Returning the file name
            System.out.println("File name: " + myObj.getName());

// Returning the path of the file
            System.out.println("Absolute path: " + myObj.getAbsolutePath());

// Displaying whether the file is writable
            System.out.println("Writeable: " + myObj.canWrite());

// Displaying whether the file is readable or not
            System.out.println("Readable " + myObj.canRead());

// Returning the length of the file in bytes
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
