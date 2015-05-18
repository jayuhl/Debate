package debate.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import me.mark.debate.Debater;

// Noah Winston
// May 15, 2015

public class FileLoader
{
	// Loading from CSV. "<School Name>", "<Debater Name>", "<Total Score>"
	// Delimiter is a comma for each item per row
	public static HashMap<String, ArrayList<Debater>> loadFromFile(String fileName) throws IOException
	{
		HashMap<String, ArrayList<Debater>> resultMap = new HashMap<String, ArrayList<Debater>>();

		BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

		String line = "";

		while ((line = reader.readLine()) != null)
		{
			String[] info = line.split(",");
			String school = info[0];

			if (!resultMap.containsKey(school))
			{
				resultMap.put(school, new ArrayList<Debater>());
			}

			resultMap.get(school).add(createDebaterObject(Arrays.copyOfRange(info, 1, info.length)));

		}

		reader.close();

		return resultMap;

	}

	private static Debater createDebaterObject(String[] info)
	{
		return new Debater(info[0].trim(), Integer.parseInt(info[1].trim()));
	}
}
