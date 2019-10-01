import java.util.ArrayList;
import java.util.List;

public class TVShowsRunner
	{
static ArrayList< TVShowsClassifications > TVShows;

		public static void main(String[] args)
			{
				TVShows = new ArrayList < TVShowsClassifications >();
				
				TVShows.add(new TVShowsClassifications("Psych", "Comedy", 8));
				TVShows.add(new TVShowsClassifications("Killing Eve", "Drama", 2));
				TVShows.add(new TVShowsClassifications("Veep", "Comedy", 7));
				TVShows.add(new TVShowsClassifications("Brooklyn Nine-Nine", "Sitcom", 6));
				TVShows.add(new TVShowsClassifications("Numb3rs", "Crime", 6));
				
				printList();
				addYear();
				printList();
				removeLongestTitle();
				printList();
				//fewestAndMost();
				//printList();
			}
		
		public static void printList()
		{
				for (TVShowsClassifications p : TVShows)
					{
						System.out.print(p.getTitle() + ", ");
						System.out.print(p.getGenre() + ", ");
						System.out.println(p.getNumberOfSeasonsAired());
					}

			}
		
		public static void addYear()
		{
			System.out.println("\nEach show with a year added to numberOfSeasonsAired: ");
			for (int i = 0; i < 5 ; i++)
				{
			TVShows.get(i).setNumberOfSeasonsAired(TVShows.get(i).getNumberOfSeasonsAired() + 1);
			
				}
		}
		
		public static void removeLongestTitle()
		{
		
			System.out.println("\nYour shows without the longest titled show:");
			int index = 0;
			int max = TVShows.get(0).getTitle().length();
			for (int p = 0; p < TVShows.size() ; p++)
				{
				
			if (TVShows.get(p).getTitle().length() > max )
				{
					max = TVShows.get(p).getTitle().length();
					index = p;
					
				}
				}
			TVShows.remove(index);
		}
		
		public static void fewestAndMost()
		{
			
		}

	}
