package uvsq.fr.gl_exo5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Serialization<T extends Serializable> {
	public void writeFile(T obj, String filename) {
		ObjectOutputStream oos = null;

	    try {
	      final FileOutputStream fichier = new FileOutputStream(filename);
	      oos = new ObjectOutputStream(fichier);
	      oos.writeObject(obj);
	    } catch (final java.io.IOException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        if (oos != null) {
	          oos.flush();
	          oos.close();
	        }
	      } catch (final IOException ex) {
	        ex.printStackTrace();
	      }
	    }		
		
		}
	}


