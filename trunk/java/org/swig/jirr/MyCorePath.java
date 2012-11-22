package org.swig.jirr;

/**
 * @author sad
 */
public class MyCorePath {
    long pointer=-1;
    
    public final void setText(String text){
        releasePath();
        pointer=JirrJNI.IrrlichtDevice_StringToPath(text);
    }
    
    private void releasePath(){
        if(pointer!=-1){
            JirrJNI.IrrlichtDevice_ReleasePath(pointer);
            pointer=-1;
        }
    }
    
    public MyCorePath(){
        setText("");
    }
    
    public MyCorePath(String path){
        setText(path);
    }

    @Override
    @SuppressWarnings("FinalizeDeclaration")
    protected void finalize() throws Throwable {
        releasePath();
        super.finalize();
    }
    
    public long getPointer(){
        return pointer;
    }
    
    public static long getCPtr(MyCorePath object){
        return object.getPointer();
    }
}
