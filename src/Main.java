import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = scanner.nextLine();

        char[] origine = sentence.toCharArray();
        char[] arr = sentence.toCharArray();

        Arrays.sort(arr);

        char search = ' ';
        boolean found = false;

        extern:
        for(int i = 0;i<origine.length;i++)
        {
            if(arr[i] == ' ')
                continue;
            intern:
            for(int j = 0;j<arr.length-1;j++)
            {
                if(origine[i] == arr[j])
                {
                    if(arr[j] - arr[j+1] != 0)
                    {
                        search = origine[i];
                        found = true;
                        break extern;
                    }
                    else
                        break intern;
                }
                else if(j == arr.length-2)
                {
                    if(arr[arr.length-1] != arr[arr.length - 2])
                    {
                        search = origine[i];
                        found = true;
                        break extern;
                    }
                }
            }
        }

        if(!found)
            if(arr[arr.length-2] != arr[arr.length-1]) {
                search = arr[arr.length - 1];
                found = true;
            }

        if(found)
            System.out.println("The first non-repeated character : " + search);
        else
            System.out.println("There isn't non'repeated character !");
	}
}
