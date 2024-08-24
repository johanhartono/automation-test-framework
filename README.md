**Project: Final Project Jay Jay School QA Profesi** </br>
**Language:** Java, Gherkins, Cucumber</br>
**Tech:** Gradle, Page Object Model, selenium web driver, RestAssured,Git, Github, Github Actions workflow, CLI Gradlew</br>
**IDE:** VS Cod / IntelliDJA</br>
**Purpose of Project:** Automation API and Web UI Testing Framework</br>

**Source API for learning:**</br>
1. https://gorest.co.in/</br>
2. https://dummyapi.io/</br>
3. https://fakerestapi.azurewebsites.net/index.html</br>
4. https://fakestoreapi.com/</br>
5. https://reqres.in/</br>
6. https://fakeapi.platzi.com/</br>
7. etc etc. googling yourself</br>
</br>
**Source code siap dipakai untuk mengetest API dan Web UI Elements**.</br>
**Struktur Folder Project dibagi menjadi  5 bagian:**</br>
1. features (Gherkins language) </br>
2. helper (Utilities dan model) </br>
3. pages (Page Object Model) </br>
4. runner (Mass Runing annotation) </br>
5. stepFef (Definisi step dari features) </br>
</br>
**Dependencies libaries dapat di lihat di build.gradle.**</br>
</br>
**Cara Menjalankan Project:** </br>
1. Clone Repository </br>
2. Buka dengan IDE favorit anda. lebih cenderung menggunakan VSCode/IntelliDJA</br>
3. lakukan gradle syncing. </br>
4. setelah itu jalankan runner dari folder runner untuk API dan Web.

**Contoh hasil Test Run cucumber:**
1. @web
   ![image](https://github.com/user-attachments/assets/f3444b62-3de2-41bb-a946-6ff910b4a4c0)

3. @api

   ![image](https://github.com/user-attachments/assets/f96c9be2-fd2f-4da9-a51f-cf92a094d968)
   ![image](https://github.com/user-attachments/assets/f324d5f5-69f7-41f5-9985-77ee33ef40cc)

**Contoh hasil test menggunakan gradle task:**

1. @api
   ![image](https://github.com/user-attachments/assets/840c6f8a-9572-4631-9b17-229e7a6d20b3)

3. @web
   ![image](https://github.com/user-attachments/assets/4a52473d-8b24-4290-98d9-9ba8164cd57f)

**Contoh Hasil Github Action Wofklow**
![image](https://github.com/user-attachments/assets/a67f850e-c972-4a22-9911-3fab68086528)

![image](https://github.com/user-attachments/assets/8d2b292c-1ae6-4583-8c02-3ce52be5aa40)

![image](https://github.com/user-attachments/assets/a698d631-5a8a-4b04-ad30-b22300137ecd)

Notes: untuk menjalankan di github action workflow perlu dipehartikan opsi chrome headless harus diaktifkan
![image](https://github.com/user-attachments/assets/bd5602f8-fa4a-49f0-8a15-ff04c9c4869e)

