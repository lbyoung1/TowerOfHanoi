
public class TowerOfHanoi
{
        static Tower[] towers = new Tower[3];		//Tower array, towers
        static int numDisks;
        static long numMoves;


        public static void main(String[] args)
        {

                for (numDisks = 3; numDisks <= 32; numDisks++)		//loop through number of disks
                {
                        numMoves = 0;		//initialize number of moves to 0

                        towers[0] = new Tower('A', numDisks);			//add 3 tower objects to array towers
                        towers[1] = new Tower('B', numDisks);
                        towers[2] = new Tower('C', numDisks);
                        towers[0].init();								//initialize the first one will all the disks

                        if (numDisks == 5)			//display towers when there are 5 disks
                        {
                                displayTowers();
                        }

                        // Find the solution recursively

                        moveDisks(numDisks, towers[0], towers[1], towers[2]);
                        System.out.println("Moving " + numDisks + " completed in " + numMoves + " moves!");
                }
        }
        // Recursive method for moving n disks from
        // fromTower to toTower with auxTower

        public static void moveDisks(int n, Tower beg, Tower aux, Tower end)
                        //***  Tower end, Tower aux)
        {

                if (n == 1)
                {
                        beg.move(end);
                        numMoves++;

                        if (numDisks == 5)
                        {
                                displayTowers();
                        }
                }
                else
                {
                        moveDisks(n - 1, beg, end, aux);
                        moveDisks(1, beg, aux, end);
                        moveDisks(n - 1, aux, beg, end);

                }
        }

        public static void displayTowers()
        {
                System.out.println("Towers: ");
                System.out.println(towers[0]);
                System.out.println(towers[1]);
                System.out.println(towers[2]);
                System.out.println();

        }

}