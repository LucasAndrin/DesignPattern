package unit.exercices.exe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColumnGeneratorTest {

    ColumnGenerator column = ColumnGenerator.create("column");

    @Test
    void columnInteger() {
        assertEquals("`column` INT", column.integer().toString());
    }

    @Test
    void columnAutoIncrement() {
        assertEquals("`column` INT AUTO_INCREMENT", column.integer().autoincrement().toString());
    }

    @Test
    void columnNotNull() {
        assertEquals("`column` INT NOT NULL AUTO_INCREMENT", column.integer().autoincrement().notnull().toString());
    }

}