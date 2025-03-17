# Java I/O. Legacy I/O and NIO

## Literature and Resources

- [Basic I/O](https://docs.oracle.com/javase/tutorial/essential/io/index.html)
- [Legacy File I/O Code](https://docs.oracle.com/javase/tutorial/essential/io/legacy.html)

## Topics

- I/O Streams
- java.io.File I/O and NIO java.nio.file.Path/java.nio.file.Files
- Mapping of legacy java.io.File and java.nio.file.Path/java.nio.file.Files


## Mapping of legacy java.io.File and java.nio.file.Path/java.nio.file.Files

| java.io.File                                      | java.nio.file                                                                                        | Description                                                                                                                                             |
|---------------------------------------------------|------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| java.io.File                                      | java.nio.file.Path                                                                                   | ThePathClass                                                                                                                                            |
| java.io.RandomAccessFile                          | The SeekableByteChannel functionality.                                                               | RandomAccessFiles                                                                                                                                       |
| File.canRead,canWrite,canExecute                  | Files.isReadable, Files.isWritable, and Files.isExecutable.                                          | On UNIX filesystems,theManagingMetadata(FileandFileStoreAttributes) packageisusedtochecktheninefilepermissions.CheckingaFileorDirectoryManagingMetadata |
| File.isDirectory(),File.isFile(),andFile.length() | Files.isDirectory(Path,LinkOption...), Files.isRegularFile(Path,LinkOption...), and Files.size(Path) | ManagingMetadata                                                                                                                                        |
| File.lastModified()andFile.setLastModified(long)  | Files.getLastModifiedTime(Path,LinkOption...) and Files.setLastModifiedTime(Path,FileTime)           | ManagingMetadata                                                                                                                                        |

| The File methods that set various attributes: setExecutable, setReadable, setReadOnly, setWritable	These methods are replaced by the Files method setAttribute(Path, String, Object, LinkOption...).	Managing Metadata
| new File(parent, "newfile")	parent.resolve("newfile")	Path Operations
| File.renameTo|	Files.move|	Moving a File or Directory|
| File.delete|Files.delete|	Deleting a File or Directory|
| File.createNewFile|Files.createFile|	Creating Files|
| File.deleteOnExit	Replaced by the DELETE_ON_CLOSE option specified in the createFile method.	Creating Files
| File.createTempFile|	Files.createTempFile(Path, String, FileAttributes<?>), Files.createTempFile(Path, String, String, FileAttributes<?>)	| Creating Files Creating and Writing a File by Using Stream I/O Reading and Writing Files by Using Channel I/O
| File.exists|	Files.exists and Files.notExists|	Verifying the Existence of a File or Directory|
| File.compareTo and equals	|Path.compareTo and equals|	Comparing Two Paths|
| File.getAbsolutePath and getAbsoluteFile	| Path.toAbsolutePath|	Converting a Path
| File.getCanonicalPath and getCanonicalFile|	Path.toRealPath or normalize|	Converting a Path (toRealPath)|
| Removing Redundancies From a Path (normalize)
| File.toURI| Path.toURI|	Converting a Path|
| File.isHidden| Files.isHidden|	Retrieving Information About the Path|
| File.list and listFiles	|Path.newDirectoryStream	|Listing a Directory's Contents
| File.mkdir and mkdirs	|Files.createDirectory	|Creating a Directory|
| File.listRoots	| FileSystem.getRootDirectories	|Listing a File System's Root Directories|
| File.getTotalSpace, File.getFreeSpace, File.getUsableSpace	|FileStore.getTotalSpace, FileStore.getUnallocatedSpace, FileStore.getUsableSpace, FileStore.getTotalSpace|	File Store Attributes