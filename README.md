# Android ISYMED 2024

Repository create to share the content of ISYMED 2024 Android course.

Contact: 
- email: mejoselli@gmail.com

# Final Project
Create an Android Application that can be used for health

#### Project Description:
This project aims to guide students through the process of developing a fully functional Android application named "BMI Insight," which calculates and tracks a user's Body Mass Index (BMI) over time. The BMI Insight app is designed to reinforce concepts related to Android UI/UX design, activity lifecycle, data persistence, and RecyclerView implementation. By the end of this project, students will have gained practical experience in building an application that not only calculates BMI based on user input but also maintains a historical record of calculations for users to track their health progress.

#### Project Features:
1. **BMI Calculation Activity:**
   - This activity serves as the main entry point of the app, where users can input their height (in centimeters or inches using spinner for selection) and weight (in kilograms or pounds).
   - Upon submitting their details, the app calculates the BMI using the formula: weight (kg) / [height (m)]^2 or [weight (lb) / [height (in)]^2] * 703 for metric and imperial units, respectively.
   - The result is displayed to the user along with a brief interpretation of the BMI category (Underweight, Normal, Overweight, Obese).

2. **Historical BMI Data Activity:**
   - This activity displays a list of previous BMI calculations stored in the app, including the date and time of each entry.
   - The data is presented in a RecyclerView, enabling efficient scrolling and interaction.
   - Users can view their progress over time, helping to motivate and inform their health and fitness decisions.

3. **Data Persistence:**
   - The app uses Room, an abstraction layer over SQLite, to persistently store user data locally on the device.
   - Each BMI calculation, along with its timestamp, is saved in the database, allowing for long-term tracking and analysis.

4. **Navigation:**
   - Users can easily navigate between the BMI Calculation activity and the Historical BMI Data activity, ensuring a seamless user experience.

#### Learning Outcomes:
- Understand the basics of Android UI design, including the use of EditText, Button, TextView, and RecyclerView.
- Implement activities in Android and manage their lifecycle.
- Use Room for data persistence, including defining entities, DAOs (Data Access Objects), and databases.
- Apply the RecyclerView widget to display a list of items efficiently.
- Integrate unit conversions (metric to imperial and vice versa) to accommodate user preferences.
- Practice using Android Studio, including its debugging and testing tools.

#### Project Evaluation Criteria:
- **Functionality:** The app should perform all specified functions correctly, including BMI calculation, data persistence, and historical data presentation.
- **UI/UX Design:** The app should provide an intuitive and user-friendly interface, adhering to Android design principles.
- **Code Quality:** Code should be well-organized, commented, and follow best practices for Android development.
- **Persistence Implementation:** The use of Room should be correctly implemented for data storage, retrieval, and display in the RecyclerView.
- **Innovation and Creativity:** Additional features or design elements that enhance the user experience will be considered positively.

#### Deliverables:

The project on a zip file A report in pdf of the project containing: 
- name of the students,
- introduction, objectives...
- screens of the application
- components used... 

Worth: 80% of the grade
Can be done in groups of 2/3
Deadline: 20/03/2023

Link to send: [dropbox](https://www.dropbox.com/request/s2q3qH8s1cmDkLidZh9L)
 
