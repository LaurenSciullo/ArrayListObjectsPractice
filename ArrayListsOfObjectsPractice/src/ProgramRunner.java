import java.util.ArrayList;

public class ProgramRunner
	{
static ArrayList< Program > TVShows;

		public static void main(String[] args)
			{
				TVShows = new ArrayList < Program >();
				
				TVShows.add(new Program("Psych", "Comedy", 8));
				TVShows.add(new Program("Killing Eve", "Drama", 2));
				TVShows.add(new Program("Veep", "Comedy", 7));
				TVShows.add(new Program("Brooklyn Nine-Nine", "Sitcom", 6));
				TVShows.add(new Program("Numb3rs", "Crime", 6));
				
				for (Program p : TVShows)
					{
						System.out.print(p.getTitle() + ", ");
						System.out.print(p.getGenre() + ", ");
						System.out.println(p.getNumberOfSeasonsAired());
					}
				
			printList();
			

			}
		
		public static void printList()
		{
			System.out.println("\nEach show with a year added to numberOfSeasonsAired: ");
			for (int i = 0; i < 5 ; i++)
				{
			TVShows.get(i).setNumberOfSeasonsAired(TVShows.get(i).getNumberOfSeasonsAired() + 1);
			System.out.println(TVShows.get(i).getTitle() + ", " + TVShows.get(i).getNumberOfSeasonsAired());
			
				}
			
			for (int p = 0; p < 10; p++)
				{
			if (Title.size() > 4 )
				{
					TVShows.get(p).setTitle(TVShows.);;
					System.out.println(TVShows.get(p).getTitle());
				}
				}
			
		}

	}
