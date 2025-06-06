import java.util.*;
class Main{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
        System.out.println("-----------LIST MENU-----------");
        System.out.println("1.Adding the data\n2.Get the data from the specific index\n3.remove the data from the specific index\n4.remove the specific data\n5.find the list size\n6.search\n7.Inserting at specific index\n8.List check fro empty\n9.Find the index of the data\n10.clear the list\n11.Display\n12.exit");
        System.out.println("-------------------------------");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
        int num,index;
        switch(choice){
            case 1:
                System.out.print("Enter the num: ");
                num = sc.nextInt();
                list.add(num);
                System.out.println(num+"is added to the list");
                break;
            case 2:
                System.out.print("Enter the index:");
                index = sc.nextInt();
                System.out.println("Printing the index of the num...");
                System.out.println(list.get(index));
                break;
            case 3:
                System.out.print("Enter the index:");
                index = sc.nextInt();
                System.out.println(list.get(index)+" is removed from the list");
                list.remove(index);
                break;
            case 4:
                System.out.print("Enter the number to remove: ");
                num = sc.nextInt();
                System.out.println(num+" is removing from the list");
                list.remove(Integer.valueOf(num));
                break;
            case 5:
                System.out.println(list.size());
                break;
            case 6:
                System.out.print("Enter the number:");
                num = sc.nextInt();
                System.out.println(list.contains(num));
                break;
            case 7:
                System.out.print("Enter the number:");
                num = sc.nextInt();
                System.out.print("Enter the index:");
                index = sc.nextInt();
                list.set(index,num);
                break;
            case 8:
                System.out.println(list.isEmpty());
                break;
            case 9:
                System.out.print("Enter the number:");
                num = sc.nextInt();
                System.out.println("Printing the index...");
                System.out.println("The index is"+list.indexOf(num));
                break;
            case 10:
                list.clear();
                System.out.println("The list is cleared");
                break;
            case 11:
                System.out.println(list);
                break;
            case 12:
                System.out.println("Exiting..");System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
        }

    }
}
