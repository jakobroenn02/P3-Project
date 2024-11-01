# P3 JavaFX Application

## Prerequisites

- **Java Development Kit (JDK):** Version 17 or higher.
- **JavaFX SDK:** Version matching the JDK.
- **Visual Studio Code (VS Code):** Latest version.
- **VS Code Extensions:**
  - [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## Setup Instructions



1. **Windows:**

   git clone https://your-repo-url.git

   Place the Javafx SDK folder in the lib folder of the project.
   Rename the folder to "javafx".
   Copy style.css and Main.fxml in src/p3 to bin/p3.
   
   To run the program, insert these two lines in the terminal:

   ```sh

   javac --module-path "lib/javafx/lib" --add-modules javafx.controls,javafx.fxml -d bin src/p3/*.java

   java --module-path "lib/javafx/lib" --add-modules javafx.controls,javafx.fxml -cp bin p3.Main

   if for whatever reason you get build errors, make sure the path in --module-path "lib/javafx/lib" matches the right directory that the lib is located, and your system enviroment variables for the sdk's are set.
   You can also try to link the lib files within the project page of vscode.


2. **OSX/Linux** 

       ```sh
    git clone https://your-repo-url.git
    Place the all the files from the Javafx SDK lib folder into lib/javafx

     To run the program, insert these two lines in the terminal:

   ```sh

   javac --module-path "lib/javafx/lib" --add-modules javafx.controls,javafx.fxml -d bin src/p3/*.java

   java --module-path "lib/javafx/lib" --add-modules javafx.controls,javafx.fxml -cp bin p3.Main

   if for whatever reason you get build errors, make sure the path in --module-path "lib/javafx/lib" matches the right directory that the lib is located, and your system enviroment variables for the sdk's are set.
   You can also try to link the lib files within the project page of vscode.

   
3.**VSCode run method**
To enable vscode's easy build/debug feature/btn,

Open launch.json.
make sure the correct path is set in vmArgs, as follows:
            "vmArgs": "--module-path \"${workspaceFolder}/lib/javafx/lib\" --add-modules=javafx.controls,javafx.fxml",



