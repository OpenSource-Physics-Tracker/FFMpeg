//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.ffmpeg.util;

import java.util.Iterator;
import java.util.List;
import org.bridj.Platform;
import org.bridj.StructCustomizer;
import org.bridj.StructDescription;
import org.bridj.StructFieldDescription;
import org.bridj.ann.Alignment;

public class AlignmentCustomizer extends StructCustomizer {
    public AlignmentCustomizer() {
    }

    public void beforeLayout(StructDescription desc, List<StructFieldDescription> aggregatedFields) {
        Iterator var4 = aggregatedFields.iterator();

        while(true) {
            while(true) {
                StructFieldDescription field;
                do {
                    if (!var4.hasNext()) {
                        return;
                    }

                    field = (StructFieldDescription)var4.next();
                } while(field.field.isAnnotationPresent(Alignment.class));

                if (Platform.isLinux() && !Platform.is64Bits()) {
                    field.alignment = 4L;
                } else {
                    field.alignment = 8L;
                }
            }
        }
    }
}
