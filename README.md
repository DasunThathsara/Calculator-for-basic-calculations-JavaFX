# This is my first JavaFX GUI program

Simple Calculator : Using JavaFX.
<br /><br />
<h2>Resources.</h2>
<ul>
  <li>
    <p>
      Firstly you must intall Java jdk. <a href="https://www.oracle.com/java/technologies/downloads/" target="_blank">Click here</a> to download it.
    </p>
  </li>
  <li>
    <p>
      And next you must intall JavaFX sdk. <a href="https://gluonhq.com/products/javafx/" target="_blank">Click here</a> to download it.
    </p>
  </li>
  <li>
    <p>
      And after you can install Scene Builder to make scenes to your GUI. <a href="https://gluonhq.com/products/scene-builder/" target="_blank">Click here</a> to download it.
    </p>
  </li>
</ul>
<br />


<h2>How to create JavaFX project?</h2>
<dl>
    <dt>Follow these steps to add JavaFX to Intellij IDE:</dt>
    <dd>
      First, how to create JavaFX project select <b><i>"New -> Project"</i></b> now you can see window like this:<br />
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20create1.JPG?raw=true" /><br /><br />
      And next, select JavaFX as your project type and select your java sdk and select <b>Next</b>. Now you can see window like this:<br />
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20create2.JPG?raw=true" /><br /><br />
      Now you can enter your project name and select your location.After you select that you can select <b>Finish</b>. Congratulations..! you created your first JavaFX project : ) . Now you can see your project like this:<br /><br />
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20create3.JPG?raw=true" />
   </dd>
</dl>
<br />


<h2>How to add JavaFX sdk and scene builder to your JavaFX project?</h2>
<ol>
  <li>JavaFX SDK</li>
  <dl>
    <dd>
      <p>
        <b>File -> Project Structure</b> : <br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20structure.png?raw=true" />
      </p>
    </dd>
    <dd>
      <p>
        <b>After you can see this window after select libraries -> add option : </b><br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20setup.JPG?raw=true" />
      </p>
    </dd>
    <dd>
      <p>
        <b>Now you can select Java and add your JavaFx library like this : </b><br />
          <i>(How to add JavaFX library : Goto your extracted JavaFX folder -> select lib folder -> press OK)</i>
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20setup2.JPG?raw=true" /><br />
      </p>
    </dd>
    <dd>
      <p>
        And now you can select <b>Apply</b> and <b>OK</b>
      </p>
    </dd>
    <dd>
      <p>
        <b>Now goto File -> Settings</b><br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/settings.JPG?raw=true" /><br />
      </p>
    </dd>
    <dd>
      <p>
        <b>Search JavaFX and put tick</b><br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/prop%20setup3.JPG?raw=true" /><br />
        Now press Apply and press OK
      </p>
    </dd>
    <dd>
      <p>
        <b>Final step of setup javafx:</b><br />
        Goto Run -> Edit Configurations <br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/run.png?raw=true" /><br /><br />
        Now goto Modify options -> Add VM options<br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/addvm.png?raw=true" /><br /><br />
        Now paste this code to VM options text box <i><b>--module-path " enter your JavaFX lib path to hear " --add-modules javafx.controls,javafx.fxml</b></i><br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/addvmop.JPG?raw=true" /><br />
        press Apply and press OK.
      </p>
    </dd>
  </dl>
  
  
  <li>Scene Builder</li>
  <dl>
    <dd>
      <p>
        Goto File -> Settings<br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/settings.JPG?raw=true" /><br />
      </p>
    </dd>
    <dd>
      <p>
        Goto Languages and Frameworks -> JavaFX now you can select the location of your Scene Builder ".exe" file and add it<br />
        <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/SBadding.JPG?raw=true" /><br />
        Now press Apply and press OK
      </p>
    </dd>
  </dl>
</dl>
<hr />
<center><b>JavaFX Setup is over. Now you can start coding and build your GUI application.</b></center>
<hr />
<h3>Preview of output:</h3>
<img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/Capture.JPG?raw=true" />
<br /><br />
<p>If you want to change your app title, edit this to do it (Main.java):</p> 
<img src="https://raw.githubusercontent.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/main/20220403_000340.jpg" />
<br />

<h2>How to open FXML file through Scene Builder?</h2>
<dl>
  <dt>
    <p>Right click your fxml file -> select Scene Builder:</p>
  </dt>
  <dd>
    <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/openscenebuilder.png?raw=true" /><br /><br />
    After it open like this:<br />
    <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/Scene%20Builder.JPG?raw=true" /><br /><br />
    Now you can edit fxml file graphicaly.
  </dd>
</dl>


<br />
<h2>How to add css?</h2>
<ul>
  <li>Firstly you should add css file to your package</li>
  <ul>
    <li>
      Right click your package -> New -> File<br />
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/Untitled.png?raw=true" /><br /><br />
    </li>
    <li>
      Enter your css file name<br />
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/addcss.JPG?raw=true" /><br /><br /><br />
    </li>
  </ul>
  <li>
    After you can add it your <b>fxml </b>file and select css class, using <b>scene builder</b>
  </li>
  <dl>
    <dd>
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/SBcsstools.JPG?raw=true" />
    </dd>
  </dl>
  <li>
    Finaly you can apply your own css styles in your JavaJX program. But remember onething. You should write prefix in your each css code. Beacouse you are using css in java fx, not html. <i><b>ex:- "-fx-backgroung-color: red;"</b></i>
  </li>
  <dl>
    <dd>
      <img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/stylecss.JPG?raw=true" />
    </dd>
  </dl>
</ul>
<br />
<h3>Preview of my calculator after using css:<br /></h3>
<img src="https://github.com/DasunThathsara/Calculator-for-basic-calculations-JavaFX-/blob/main/img/css1.JPG?raw=true" />
<hr />
<br />
<p>Do you want to learn how to build this calculator using Python Tkinter ? <a href="https://github.com/DasunThathsara/Calculator-for-basic-calculations-Using-Python-Tkinter-" target="_blank">Click here</a> to open it.</p>
