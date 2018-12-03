/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class LinterTest {
    @Test public void linterTestEmptyFile() {
        Path testFile = FileSystems.getDefault().getPath("resources/empty.js");
        assertEquals("Should return 0", 0, Linter.semicolonLinter(testFile));

    }

    @Test public void linterTesteErrorlessFile() {
        Path testFile = FileSystems.getDefault().getPath("resources/no-error.js");
        assertEquals("Should return 0", 0, Linter.semicolonLinter(testFile));

    }

    @Test public void linterTesteOneErrorFile() {
        Path testFile = FileSystems.getDefault().getPath("resources/one-error.js");
        assertEquals("Should return 0", 1, Linter.semicolonLinter(testFile));

    }

    @Test public void linterTesteFewErrorsile() {
        Path testFile = FileSystems.getDefault().getPath("resources/few-errors.js");
        assertEquals("Should return 0", 3, Linter.semicolonLinter(testFile));

    }

    @Test public void linterTesteManyErrorsFile() {
        Path testFile = FileSystems.getDefault().getPath("resources/many-errors.js");
        assertEquals("Should return 0", 10, Linter.semicolonLinter(testFile));

    }
}
