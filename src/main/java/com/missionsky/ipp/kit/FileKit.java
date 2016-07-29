package com.missionsky.ipp.kit;

import java.io.File;

public class FileKit {
	public static void delete(File file) {
		if (file != null && file.exists()) {
			if (file.isFile()) {
				file.delete();
			} else if (file.isDirectory()) {
				File files[] = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					delete(files[i]);
				}
			}
			file.delete();
		}
	}
}
