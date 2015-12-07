package com.example.wynsean.petdatabase;

/**
 * Created by Jerald on 10/20/2015.
 */
public class Phones {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Phones[] dogs = {
            new Phones("iMac", "\nThe iMac is a range of all-in-one Macintosh desktop computers designed and built by Apple Inc. It has been the primary part of Apple's consumer desktop offerings since its debut in August 1998 (shipped; introduced June 1998), and has evolved through six distinct forms. "
                   ,R.drawable.imac),

            new Phones("Macbook Air", "\nThe MacBook Air is a line of Macintosh ultraportable notebook computers from Apple Inc. The Air was designed to balance both performance and portability, consisting of a full-sized keyboard design, a machined casing made of aluminum, and a very light and thin structure. The MacBook Air is available in two sizes, with the length of the diagonal display determining the model size: 13.3-inch and 11.6-inch (or 33.78 cm and 29.46 cm, respectively). A range of model choices with different specifications are produced by Apple, and as of 2011, all Air models use solid-state drive (SSD) storage and Intel Core i5 or i7 central processing units (CPUs).",
                    R.drawable.macair),

            new Phones("Macbook Pro","\nThe MacBook Pro (sometimes abbreviated MBP) is a line of Macintosh portable computers introduced in January 2006 by Apple Inc., now in its third generation. Replacing the PowerBook G4, the MacBook Pro was the second model to be announced in the Apple–Intel transition, after the iMac. It is the high-end model of the MacBook family and is currently produced with 13- and 15-inch screens. A 17-inch version was available in the past."
                    ,R.drawable.macpro)
};

    private Phones(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}

