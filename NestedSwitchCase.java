import java.util.Scanner;
public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number 1 or 2:");
        int a=in.nextInt();

        switch(a){
            case 1->{
                System.out.println("Hea was head of my Family.My GrandFather Marhoom Sheikh Gafoor Khan.");
                System.out.println("Enter number 1 or 2 or 3:");
                int b=in.nextInt();
                switch(b){
                    case 1->{
                        System.out.println("He is my father name is sheikh Azad. He is a business man ");
                        System.out.println("Enter number 1 or 2 or 3:");
                        int c=in.nextInt();
                        switch(c){
                            case 1->System.out.println("He is my younger brother Rehan khan.");
                            default-> System.out.println("wrong");

                        }
                    }
                    case 2->{
                        System.out.println("He is my elder auncle Sheikh aslam khan.My fathers younger brother.");
                        System.out.println("Enter number 1 or 2 or 3:");
                        int d=in.nextInt();
                        switch(d){
                            case 1->System.out.println("He is my sibling Parvej khan.");
                            default-> System.out.println("wrong");

                        }
                    }
                    case 3->{
                        System.out.println("He is my younger uncle sheikh Amjad khan");
                        System.out.println("Enter number 1 or 2 or 3:");
                        int e=in.nextInt();
                        switch(e) {
                            case 1 -> System.out.println("He is our family younger childer Afzal khan");
                            default-> System.out.println("wrong");
                        }
                    }
                    default-> System.out.println("wrong");
                }
            }
            case 2->{
                System.out.println("She was my GrandMother Marhoom Ameena Bee.And i am very close to her:)");
                System.out.println("Enter number 1 or 2 or 3:");
                int f=in.nextInt();
                switch(f){
                    case 1->{
                        System.out.println("She is my lovely Mother Jareena bee");
                        System.out.println("Enter number 1 or 2 or 3:");
                        int g=in.nextInt();
                        switch(g){
                            case 1-> System.out.println("She is my elder sister Tabassum khan");
                            case 2-> System.out.println("Here is me tarannum khan");
                            case 3-> System.out.println("She is my younger sister fiza khan");
                            default-> System.out.println("wrong");
                        }
                    }
                    case 2->{
                        System.out.println("She is my elder Aunts Rukshana bee");
                        System.out.println("Enter number 1 or 2 or 3:");
                        int h=in.nextInt();
                        switch(h){
                            case 1-> System.out.println("She is my sibling rukshar bano");
                            default-> System.out.println("wrong");
                        }
                    }
                    case 3->{
                        System.out.println("she is my younger aunt Sajda bee");
                        System.out.println("Enter number 1 or 2 or 3:");
                        int i=in.nextInt();
                        switch(i){
                            case 1-> System.out.println("She is my another sibling Tamanna Khan");
                            case 2-> System.out.println("She is our little yougher daughter of family Afraoj Bee");
                            default-> System.out.println("wrong");
                        }
                    }
                }
            }
            default-> System.out.println("wrong");
            }
        }
    }

