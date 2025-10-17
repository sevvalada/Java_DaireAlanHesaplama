import  java.util.Scanner;
/*
Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/
public class daireHesaplama {
    public static void main(String[] args)
    {
        double r,aci,pi=3.14,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenın Yarıçapını Giriniz:");
        r = input.nextDouble();
        System.out.println("Dairenın Merkez Açısını Giriniz");
        aci = input.nextDouble();
        alan=(pi*(r*r)*aci);
        System.out.println("Dairenın Alanı:"+alan );

    }
}
