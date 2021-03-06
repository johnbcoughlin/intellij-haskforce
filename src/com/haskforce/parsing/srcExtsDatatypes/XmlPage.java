package com.haskforce.parsing.srcExtsDatatypes;

import java.util.Arrays;

/**
 * XmlPage l (ModuleName l) [ModulePragma l] (XName l) [XAttr l] (Maybe (Exp l)) [Exp l]
 */
public class XmlPage extends ModuleTopType {
    public SrcInfoSpan srcInfoSpan;
    public ModuleName moduleName;
    public ModulePragmaTopType[] modulePragmas;
    public XNameTopType xName;
    public XAttr[] xAttrs;
    public ExpTopType expMaybe;
    public ExpTopType[] exps;

    @Override
    public String toString() {
        return "XmlPage{" +
                "exps=" + Arrays.toString(exps) +
                ", expMaybe=" + expMaybe +
                ", xAttrs=" + Arrays.toString(xAttrs) +
                ", xName=" + xName +
                ", modulePragmas=" + Arrays.toString(modulePragmas) +
                ", moduleName=" + moduleName +
                '}';
    }
}
