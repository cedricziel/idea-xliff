package com.cedricziel.idea.xliff;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.icons.AllIcons;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xml.XmlTagNameProvider;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class XLIFFTagProvider implements XmlTagNameProvider {
    @Override
    public void addTagNameVariants(List<LookupElement> elements, @NotNull XmlTag tag, String prefix) {

        if (tag.getParentTag() == null) {
            return;
        }

        String name = tag.getParentTag().getName();
        switch (name) {
            case "xliff":
                elements.add(createLookupElement("file"));
                break;
            case "file":
                elements.add(createLookupElement("body"));
                break;
            case "body":
                elements.add(createLookupElement("trans-unit"));
                break;
            case "trans-unit":
                elements.add(createLookupElement("source"));
                elements.add(createLookupElement("target"));
                break;
        }
    }

    @NotNull
    private LookupElementBuilder createLookupElement(@NotNull String identifier) {
        return LookupElementBuilder
                .create(identifier)
                .withIcon(AllIcons.FileTypes.Xml)
                .withTypeText("XLIFF", true);
    }
}
