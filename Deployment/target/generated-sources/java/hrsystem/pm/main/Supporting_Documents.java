package hrsystem.pm.main;


import hrsystem.Pm;
import hrsystem.pm.main.Milestone;

import io.ciera.runtime.summit.classes.IModelInstance;
import io.ciera.runtime.summit.exceptions.XtumlException;


public interface Supporting_Documents extends IModelInstance<Supporting_Documents,Pm> {

    // attributes
    public void setName( String m_Name ) throws XtumlException;
    public String getName() throws XtumlException;
    public void setDocument( String m_Document ) throws XtumlException;
    public String getDocument() throws XtumlException;
    public void setState( String m_State ) throws XtumlException;
    public String getState() throws XtumlException;
    public void setNotes( String m_Notes ) throws XtumlException;
    public String getNotes() throws XtumlException;


    // operations


    // selections
    default public void setR3_Milestone( Milestone inst ) {}
    public Milestone R3_Milestone() throws XtumlException;


}
