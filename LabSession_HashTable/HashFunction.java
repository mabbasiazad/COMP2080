import java.util.Arrays;

class HashFunction {
    String[] array; //this is my hash table
    int arraySize;    

    HashFunction(int size) {
        arraySize = size;
        array = new String[size];
        Arrays.fill(array, "-1");
    }

    // calculate the hash value (index) for a given string
    // simplest hash function: index = value
    public void hashFunction1(String[] newElems) {
        for (int n = 0; n < newElems.length; n++) {
            String newElementVal = newElems[n];
            int index = Integer.parseInt(newElementVal);
            array[index] = newElementVal;
        }
    }

    // senario: we have a hash table with 15 elements of the number between 0 and 999
    // size of the hash table/ array: the array shoud be big enough to aovid collision 
    // but no so big that it wastes memory
    // collison: to put the elements into the index that is already occupied
    // array size is 30. We use the modulo operator that guarantees the index will be within the array size
    // rule of thumb: array size should be at least double the number of elements
    public void hashFunction2(String[] newElems) {
        int numOfCollisions = 0;
        for (int n = 0; n < newElems.length; n++) {
            String newElementVal = newElems[n];
            int index = Integer.parseInt(newElementVal) % arraySize;
            System.out.println("Modulus Index = " + index + " for value " + newElementVal);
            while (array[index] != "-1") {
                ++index;
                System.out.println("Collision Try " + index + " Instead");
                numOfCollisions++;
                index %= arraySize; // wrap around if we go off the end of the array
            }
            array[index] = newElementVal;
        }
        System.out.println("Number of Collisions = " + numOfCollisions);
    }

    public String findKey(String key) {
        int index = Integer.parseInt(key) % arraySize;
        while (array[index] != "-1") {
            if (array[index] == key) {
                System.out.println(key + " was found in index " + index);
                return array[index];
            }
            ++index;
            index %= arraySize; // wrap around if we go off the end of the array
        }
        return null;
    }

    public void doubleHashFunction(String[] newElems) {
        int numOfCollisions = 0;
        for (int n = 0; n < newElems.length; n++) {
            String newElementVal = newElems[n];
            int index = Integer.parseInt(newElementVal) % arraySize;
            int stepDistance = 7 - (Integer.parseInt(newElementVal) % 7);
            System.out.println("Modulus Index = " + index + " for value " + newElementVal);
            while (array[index] != "-1") {
                index += stepDistance;
                System.out.println("Collision Try " + index + " Instead");
                numOfCollisions++;
                index %= arraySize; // wrap around if we go off the end of the array
            }
            array[index] = newElementVal;
        }
        System.out.println("Number of Collisions = " + numOfCollisions);
    }

    public String findKeyDblHached(String key) {
        int index = Integer.parseInt(key) % arraySize;
        int stepDistance = 7 - (Integer.parseInt(key) % 7);

        while (array[index] != "-1") {
            if (array[index] == key) {
                System.out.println(key + " was found in index " + index);
                return array[index];
            }
            index += stepDistance;
            index %= arraySize; // wrap around if we go off the end of the array
        }
        return null;
    }

    public void displayArray() {

		int increment = 0;
		for (int m = 0; m < 3; m++) {
			increment += 10;
			for (int n = 0; n < 71; n++)
				System.out.print("-");
			System.out.println();
			for (int n = increment - 10; n < increment; n++) {
				System.out.format("| %3s " + " ", n);
			}
			System.out.println("|");
			for (int n = 0; n < 71; n++)
				System.out.print("-");
			System.out.println();
			for (int n = increment - 10; n < increment; n++) {
				if (array[n].equals("-1"))
					System.out.print("|      ");
				else
					System.out
							.print(String.format("| %3s " + " ", array[n]));
			}
			System.out.println("|");
			for (int n = 0; n < 71; n++)
				System.out.print("-");
			System.out.println();
		}

	}

    public static void main(String[] args) {
        HashFunction hashfunc = new HashFunction(31);
        // String[] elementsToAdd = { "1", "5", "17", "21", "26" };
        // hashfunc.hashFunction1(elementsToAdd);
        // hashfunc.displayArray();

        // hash function2 test
        // String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
        // "235", "802", "900", "723", "699", "1", "16", "999", "890",
        // "725", "998", "978", "988", "990", "989", "984", "320", "321",
        // "400", "415", "450", "50", "660", "624" };
        // hashfunc.hashFunction2(elementsToAdd2);
        // hashfunc.displayArray();

        // hashfunc.findKey("660");

        //double hash functtion test - clustring
        String[] elementsToAdd3 = { "100", "510", "170", "214", "268", "398",
        "235", "802", "1", "16", "999", "890","415", "450", "50", "660", "624" };
        //hashfunc.hashFunction2(elementsToAdd3);
        //hashfunc.displayArray();
        hashfunc.doubleHashFunction(elementsToAdd3);
        hashfunc.displayArray();
        
        hashfunc.findKeyDblHached("510");






        
    }

}
