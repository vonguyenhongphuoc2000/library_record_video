# library_record_video

<!-- 

- Sửa trong file buid.grandle của module cameraxvideo.
+ Chú ý remove applicationId
- Sửa trong file buid.grandle của Project chính
plugins {
    id 'com.android.application' version '7.3.1' apply false
    id 'com.android.library' version '7.3.1' apply false
    id 'androidx.navigation.safeargs.kotlin' version '2.4.1' apply false

}

- Trong AndroidManifest của Project chính phải thêm thuộc tính  tools:replace="android:icon", để chống bị trồn icon với module.
- Đổi tên file acitivty_main.xml của module lại để tránh bị trùng với project chính khi gọi activity qua sẽ bị lỗi.
 -->