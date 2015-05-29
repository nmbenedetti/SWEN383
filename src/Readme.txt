(Should be read as Markdown(looks marginally better))
# try{
		build using the build.xml ant file, it should handle everything.
	} catch(Exception e){
		main Method is in StartController.java
		libraries used, 
			## reading in and writing out JSON files
				*"jackson-annotations-2.5.2.jar"
		        *"jackson-core-2.5.2.jar"
		        *"jackson-databind-2.5.2.jar"
		    ## Image editing
		    	*all marvin jars located in root directory
		Package build order
			1. imageIO
			2. UndoRedo
			3. AlterCommands
			4. GUI
			5. StartUpController.java (default)
	}
# Overall design
	## Package List
		*imageIO - This is our DataLayer and contains DataLayer Objects and access classes
		*UndoRedo - This holds the CareTaker and our Stack
		*AlterCommands - This is most of our command pattern. It holds objects needed to make and undo changes.
		*GUI - Contains the Graphical User Interface for our project
		*Default - We used this to hold our startup file, StartUpController.java
	## We wanted action to start in the default; data to come in from imageIO; imageIO to populate the GUI; and the AlterCommands to handle changes; the UndoRedo should handle these files. 