# TypeWriterTextView

Type Writer Animation effect for Android TextView written in java.

![LOGO](https://github.com/ar-arvind/TypeWriterTextView/blob/master/assets/logo.jpg)

## Demo

<img src="https://github.com/ar-arvind/TypeWriterTextView/blob/master/assets/demo.gif" alt="Demo GIF" width="240" height="426">

## Setup

1. Include the following in your project's top level `build.gradle` file.

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

2. In the app `build.gradle` file add the following dependency.

```gradle
implementation 'com.github.ar-arvind:TypeWriterTextView:1.0.0'
```

## Usage sample

XML

```XML
<lib.ar.arvind.typewriter.TypeWriterTextView
     android:id="@+id/text_view"
     android:layout_width="0dp"
     android:layout_height="wrap_content"
     android:layout_marginStart="20dp"
     android:layout_marginEnd="20dp"
     android:gravity="center"
     android:textAppearance="@style/TextAppearance.AppCompat.Large"
     android:textColor="@color/colorWhite"
     app:layout_constraintBottom_toBottomOf="parent"
     app:layout_constraintLeft_toLeftOf="parent"
     app:layout_constraintRight_toRightOf="parent"
     app:layout_constraintTop_toTopOf="parent" />
```

JAVA CODE

```java
TypeWriterTextView typeWriterTextView = findViewById(R.id.text_view);

typeWriterTextView.typeText("Type Writer Animation", 100 /*Animation duration in milliseconds*/ );
(or)
typeWriterTextView.typeText(getString(R.string.type_writer_animation), 100);
```

## License

 [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
 
Copyright 2019 ar-arvind

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.