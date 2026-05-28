public class Enumrations {
    public static void main(String[] args){
        Direction d = Direction.SOUTH;
        d.move();
    } 
}

enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("move up (y+1)");
        }
    },
    SOUTH{
          @Override
        public void move(){
            System.out.println("move up (y-1)");
        }
    },
    EAST{
          @Override
        public void move(){
            System.out.println("move up (X+1)");
        }
    },
    WEST{
          @Override
        public void move(){
            System.out.println("move up (x-1)");
        }
    };

    public abstract void move();
}


//Emumareations := predefind set of constant.
