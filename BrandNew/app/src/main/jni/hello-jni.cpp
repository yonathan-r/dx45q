#include <string.h>
#include <jni.h>
#include <stdio.h>
#include <android/log.h>

#define  LOG_TAG    "someTag"



/*void testPrint(){
    //printf ("Characters: %c %c \n", 'a', 65);
}*/


extern "C" {

void testThis(){
    int foo = 42;
}

JNIEXPORT jstring JNICALL
Java_com_brandnew_MainActivity_stringFromJNI(JNIEnv *env,
                                                 jobject thiz)
{
    //testThis();
    return env->NewStringUTF("Hello world from JNI");
}

}