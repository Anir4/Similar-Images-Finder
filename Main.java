package src;

import java.awt.image.BufferedImage;


public class Main {
    public static void main(String[] args) {
        ImageClassifier imgClassifier = new ImageClassifier();
//        imgClassifier.classify();
        imgClassifier.show(0);
        imgClassifier.findSimilar(ImageClassifier.images.get(0));

//        int[] h0 = imgClassifier.LinearHist(0);
//        int[] h1 = imgClassifier.LinearHist(1);
//        int[] h2 = imgClassifier.LinearHist(2);
//
//        imgClassifier.printLinHist(h0);
//        System.out.println("-------------------------");
//        imgClassifier.printLinHist(h1);
//        System.out.println("-------------------------");
//        imgClassifier.printLinHist(h2);
//        System.out.println("-------------------------");
//
//        double d01 = imgClassifier.dist(h0, h1);
//        double d02 = imgClassifier.dist(h0, h2);
//        double d12 = imgClassifier.dist(h1, h2);
//
//        System.out.println("d01 = " + d01);
//        System.out.println("d02 = " + d02);
//        System.out.println("d12 = " + d12);

//        BufferedImage res = imgClassifier.cropTheImage(0);
//        res = imgClassifier.resize(res);
//        imgClassifier.show(res);
//        System.out.println(imgClassifier.isTransparent(res, 0, 0));

    }
}

