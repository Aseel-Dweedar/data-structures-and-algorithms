/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void hashTable() {

        // Adding a key/value to your hashtable results in the value being in the data structure
        HashTable testTable = new HashTable();
        testTable.add("Test", 8);
        assertEquals(6, testTable.hash("Test"));
        assertEquals(" [ {Test:8} ] ", testTable.printOneBucket("Test"));
        assertEquals("hashTable =[null, null, null, null, null, null,  [ {Test:8} ] , null, null, null]", testTable.toString());

        // Retrieving based on a key returns the value stored
        assertEquals(8, testTable.get("Test"));

        // Successfully returns null for a key that does not exist in the hashtable
        assertEquals(null , testTable.get("null"));

        // Successfully handle a collision within the hashtable
        testTable.add("ddd" , "ddd Value");
        testTable.add("Cat" , "Cat Value");
        assertEquals(" [ {Cat:Cat Value} {ddd:ddd Value} ] ", testTable.printOneBucket("Cat"));
        assertEquals("hashTable =[ [ {Cat:Cat Value} {ddd:ddd Value} ] , null, null, null, null, null,  [ {Test:8} ] , null, null, null]", testTable.toString());

        // Successfully retrieve a value from a bucket within the hashtable that has a collision
        assertEquals("Cat Value" , testTable.get("Cat"));

        // Successfully hash a key to an in-range value
        assertEquals(0, testTable.hash("ddd"));
        assertEquals(0, testTable.hash("Cat"));
    }
}
