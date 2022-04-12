package com.example.lookie_kotlin.안드로이드_UI

// 안드로이드에서 화면을 그리는 방법
// - XML을 이용한다
// - XML은 뭘까
// - DSL Language ->  Domain Specific Language
// - 안드로이드 UI 를 그리기 위해 특화된 언어이다

// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?
// - 픽셀, dpi, dp 단위
// - 픽셀 -> 핸드폰 화면에서 빛이 나오는 가장 작은 단위
// - dpi -> dot per inch
//    -ldpi -> 120(1인치에 120px)
//    -mdpi -> 160
//    -hdpi -> 240
//    -xhdpi -> 320
// - dp -> Density Independent Pixel
//    - 픽셀 독립적인 단위
// 어느 핸드폰이나 동일한 화면을 보여주고 싶다면 픽셀 단위가 아니라
// dp라는 단위를 이용해야 한다.

// 부모 자식 component의 차이
// 부모 컴포넌트는 화면에 실질적으로 나오지 않지만
// 자식 컴포넌트는 화면에 실징적으로 나온다.

