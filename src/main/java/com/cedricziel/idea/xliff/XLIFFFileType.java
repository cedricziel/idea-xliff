package com.cedricziel.idea.xliff;

import com.intellij.icons.AllIcons;
import com.intellij.ide.highlighter.DomSupportEnabled;
import com.intellij.ide.highlighter.XmlLikeFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class XLIFFFileType extends XmlLikeFileType implements DomSupportEnabled {
    public static final XLIFFFileType INSTANCE = new XLIFFFileType();

    @NonNls
    public static final String DEFAULT_EXTENSION = "xlf";

    @NonNls
    public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;

    private XLIFFFileType() {
        super(XLIFFLanguage.INSTANCE);
    }

    /**
     * Returns the name of the file type. The name must be unique among all file types registered in the system.
     *
     * @return The file type name.
     */
    @NotNull
    @Override
    public String getName() {
        return "XLIFF";
    }

    /**
     * Returns the user-readable description of the file type.
     *
     * @return The file type description.
     */
    @NotNull
    @Override
    public String getDescription() {
        return null;
    }

    /**
     * Returns the default extension for files of the type.
     *
     * @return The extension, not including the leading '.'.
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    /**
     * Returns the icon used for showing files of the type.
     *
     * @return The icon instance, or null if no icon should be shown.
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.Xml;
    }
}
