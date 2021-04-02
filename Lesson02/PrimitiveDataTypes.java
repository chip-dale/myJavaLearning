/*
    СТУДЕНТ: Исмаилова Фидан
    ГРУППА: WEJM_12012_ru
    ДАТА: 30.10.2020
    ТЕМА: Типы данных >> Примитивные
    ЗАДАЧА: Присвоение переменных различного типа друг другу
*/
public class PrimitiveDataTypes {
    public static void main(String[] args){
        System.out.println("Java Data Types");

    // Группа целых чисел или Целочисленные типы (Numbers: Integer Types)
        System.out.println("\nbyte [1 байт >> 8 бит]:");
        byte b = 127;
        byte b1 = -128;
        System.out.println(b);
        System.out.println(b1);

        System.out.println("\nshort [2 байта >> 16 бит]:");
        short s = 32767;
        short s1 = -32768;
        System.out.println(s);
        System.out.println(s1);

        System.out.println("\nint [4 байта >> 32 бит]:");
        int i = 2147483647;
        int i1 = -2147483648;
        System.out.println(i);
        System.out.println(i1);

        System.out.println("\nlong [8 байт >> 64 бит]:");
        long l = 123123123123123L;
        long l1 = -123123123123123L;
        System.out.println(l);
        System.out.println(l1);

    // Числа с плавающей точкой (Numbers: Floating Point Types)
        System.out.println("\nfloat [4 байта >> 32 бит]:");
        float f, f1;
        f = 1.5F;
        f1 = 15e-1F; //экспоненциальная запись значения f (Scientific Numbers)
        System.out.println(f);
        System.out.println(f1);

        System.out.println("\ndouble [8 байт >> 64 бит]:");
        double d, d1;
        d = 33.33333d;
        d1 = 1.7e+308d; //максимальное число
        System.out.println(d);
        System.out.println(d1);

    //Логическое значение булево (Booleans) >> {не проходили: boolean;}
    //Символы (Characters) >> {не проходили: char;}

        // Преобразование типов
        System.out.println("\nshort присваивает byte:");
        short sByte;
        sByte = b;
        System.out.println(sByte);
        System.out.println(b == sByte);

        System.out.println("\nint присваивает short:");
        int iShort;
        iShort = s;
        System.out.println(iShort);
        System.out.println(iShort == s);

        System.out.println("\nint присваивает byte:");
        int iByte;
        iByte = b;
        System.out.println(iByte);

        System.out.println("\nlong присваивает int:");
        long lInt;
        lInt = i;
        System.out.println(lInt);

        System.out.println("\nlong присваивает short:");
        long lShort;
        lShort = s;
        System.out.println(lShort);

        System.out.println("\nlong присваивает byte:");
        long lByte;
        lByte = b;
        System.out.println(lByte);

        System.out.println("\ndouble присваивает float:");
        double dFloat;
        dFloat = f;
        System.out.println(dFloat);

        System.out.println("\ndouble присваивает byte:");
        double dByte;
        dByte = b;
        System.out.println(dByte);

        System.out.println("\ndouble присваивает short:");
        double dShort;
        dShort = s;
        System.out.println(dShort);

        System.out.println("\ndouble присваивает int:");
        double dInt;
        dInt = i;
        System.out.println(dInt);

        System.out.println("\ndouble присваивает long:");
        double dLong;
        dLong = l;
        System.out.println(dLong);

        System.out.println("\nfloat присваивает byte:");
        float fByte;
        fByte = b;
        System.out.println(fByte);

        System.out.println("\nfloat присваивает short:");
        float fShort;
        fShort = s;
        System.out.println(fShort);

        System.out.println("\nfloat присваивает int:");
        float fInt;
        fInt = i;
        System.out.println(fInt);

        System.out.println("\nобратный вывод int >> float:");
        int iFloat = (int) fInt;
        System.out.println(iFloat);
    }
}
