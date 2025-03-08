package file_ops;
/*
Write a program that imitates file operations. Then write check tests:
 file creation, write, read, file cleanup. Use lifecycle methods.

 -create File
 -write File
 -read File
 */


import org.example.file_ops.FileOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class FileOperationsTest {

    private static final String FILE_NAME="test.txt";
    private FileOperations fileOps;

    //Before Hook
    @BeforeEach
    public void setup(){
        fileOps=new FileOperations(FILE_NAME);
    }

    @Test
    public void testCreateFile() throws IOException {
        boolean result= fileOps.createFile();
        assertThat(result)
                .isTrue();
        assertThat(Files.exists(Paths.get(FILE_NAME)))
                .isTrue();

    }
    @Test
    public void testWriteandReadFile() throws IOException {
    String content="Hello World!";
    fileOps.createFile();
    fileOps.writeInFile(content);

    String readContent=fileOps.readFromFiles();
    assertThat(readContent).isEqualTo(content);

    }
    //After Hook
        @AfterEach
    public void cleanup() throws IOException {
            System.out.println("Cleaning up");
            fileOps.cleanup();
        }


}
