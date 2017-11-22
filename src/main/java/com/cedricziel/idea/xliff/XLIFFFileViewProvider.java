package com.cedricziel.idea.xliff;

import com.intellij.lang.Language;
import com.intellij.lang.xml.XMLLanguage;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.MultiplePsiFilesPerDocumentFileViewProvider;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.NotNull;

public class XLIFFFileViewProvider extends MultiplePsiFilesPerDocumentFileViewProvider {
    public XLIFFFileViewProvider(PsiManager manager, VirtualFile virtualFile, boolean physical) {
        super(manager, virtualFile, physical);
    }

    @NotNull
    @Override
    public Language getBaseLanguage() {
        return XMLLanguage.INSTANCE;
    }

    @Override
    protected MultiplePsiFilesPerDocumentFileViewProvider cloneInner(VirtualFile fileCopy) {
        XLIFFFileViewProvider fileViewProvider = new XLIFFFileViewProvider(getManager(), fileCopy, false);
        return fileViewProvider;
    }
}
