/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IFileSystem {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IFileSystem(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IFileSystem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IFileSystem(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IReadFile createAndOpenFile(SWIGTYPE_p_path filename) {
    long cPtr = JirrJNI.IFileSystem_createAndOpenFile(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
    return (cPtr == 0) ? null : new IReadFile(cPtr, false);
  }

  public IReadFile createMemoryReadFile(SWIGTYPE_p_void memory, int len, SWIGTYPE_p_path fileName, boolean deleteMemoryWhenDropped) {
    long cPtr = JirrJNI.IFileSystem_createMemoryReadFile__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(memory), len, SWIGTYPE_p_path.getCPtr(fileName), deleteMemoryWhenDropped);
    return (cPtr == 0) ? null : new IReadFile(cPtr, false);
  }

  public IReadFile createMemoryReadFile(SWIGTYPE_p_void memory, int len, SWIGTYPE_p_path fileName) {
    long cPtr = JirrJNI.IFileSystem_createMemoryReadFile__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(memory), len, SWIGTYPE_p_path.getCPtr(fileName));
    return (cPtr == 0) ? null : new IReadFile(cPtr, false);
  }

  public IReadFile createLimitReadFile(SWIGTYPE_p_path fileName, IReadFile alreadyOpenedFile, int pos, int areaSize) {
    long cPtr = JirrJNI.IFileSystem_createLimitReadFile(swigCPtr, this, SWIGTYPE_p_path.getCPtr(fileName), IReadFile.getCPtr(alreadyOpenedFile), alreadyOpenedFile, pos, areaSize);
    return (cPtr == 0) ? null : new IReadFile(cPtr, false);
  }

  public IWriteFile createMemoryWriteFile(SWIGTYPE_p_void memory, int len, SWIGTYPE_p_path fileName, boolean deleteMemoryWhenDropped) {
    long cPtr = JirrJNI.IFileSystem_createMemoryWriteFile__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(memory), len, SWIGTYPE_p_path.getCPtr(fileName), deleteMemoryWhenDropped);
    return (cPtr == 0) ? null : new IWriteFile(cPtr, false);
  }

  public IWriteFile createMemoryWriteFile(SWIGTYPE_p_void memory, int len, SWIGTYPE_p_path fileName) {
    long cPtr = JirrJNI.IFileSystem_createMemoryWriteFile__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(memory), len, SWIGTYPE_p_path.getCPtr(fileName));
    return (cPtr == 0) ? null : new IWriteFile(cPtr, false);
  }

  public IWriteFile createAndWriteFile(SWIGTYPE_p_path filename, boolean append) {
    long cPtr = JirrJNI.IFileSystem_createAndWriteFile__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), append);
    return (cPtr == 0) ? null : new IWriteFile(cPtr, false);
  }

  public IWriteFile createAndWriteFile(SWIGTYPE_p_path filename) {
    long cPtr = JirrJNI.IFileSystem_createAndWriteFile__SWIG_1(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
    return (cPtr == 0) ? null : new IWriteFile(cPtr, false);
  }

  public boolean addFileArchive(SWIGTYPE_p_path filename, boolean ignoreCase, boolean ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE archiveType, SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t password, SWIGTYPE_p_p_IFileArchive retArchive) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), ignoreCase, ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE.getCPtr(archiveType), SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t.getCPtr(password), SWIGTYPE_p_p_IFileArchive.getCPtr(retArchive));
  }

  public boolean addFileArchive(SWIGTYPE_p_path filename, boolean ignoreCase, boolean ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE archiveType, SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t password) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_1(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), ignoreCase, ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE.getCPtr(archiveType), SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t.getCPtr(password));
  }

  public boolean addFileArchive(SWIGTYPE_p_path filename, boolean ignoreCase, boolean ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE archiveType) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_2(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), ignoreCase, ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE.getCPtr(archiveType));
  }

  public boolean addFileArchive(SWIGTYPE_p_path filename, boolean ignoreCase, boolean ignorePaths) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_3(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), ignoreCase, ignorePaths);
  }

  public boolean addFileArchive(SWIGTYPE_p_path filename, boolean ignoreCase) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_4(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), ignoreCase);
  }

  public boolean addFileArchive(SWIGTYPE_p_path filename) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_5(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
  }

  public boolean addFileArchive(IReadFile file, boolean ignoreCase, boolean ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE archiveType, SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t password, SWIGTYPE_p_p_IFileArchive retArchive) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_6(swigCPtr, this, IReadFile.getCPtr(file), file, ignoreCase, ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE.getCPtr(archiveType), SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t.getCPtr(password), SWIGTYPE_p_p_IFileArchive.getCPtr(retArchive));
  }

  public boolean addFileArchive(IReadFile file, boolean ignoreCase, boolean ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE archiveType, SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t password) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_7(swigCPtr, this, IReadFile.getCPtr(file), file, ignoreCase, ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE.getCPtr(archiveType), SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t.getCPtr(password));
  }

  public boolean addFileArchive(IReadFile file, boolean ignoreCase, boolean ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE archiveType) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_8(swigCPtr, this, IReadFile.getCPtr(file), file, ignoreCase, ignorePaths, SWIGTYPE_p_E_FILE_ARCHIVE_TYPE.getCPtr(archiveType));
  }

  public boolean addFileArchive(IReadFile file, boolean ignoreCase, boolean ignorePaths) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_9(swigCPtr, this, IReadFile.getCPtr(file), file, ignoreCase, ignorePaths);
  }

  public boolean addFileArchive(IReadFile file, boolean ignoreCase) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_10(swigCPtr, this, IReadFile.getCPtr(file), file, ignoreCase);
  }

  public boolean addFileArchive(IReadFile file) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_11(swigCPtr, this, IReadFile.getCPtr(file), file);
  }

  public boolean addFileArchive(SWIGTYPE_p_IFileArchive archive) {
    return JirrJNI.IFileSystem_addFileArchive__SWIG_12(swigCPtr, this, SWIGTYPE_p_IFileArchive.getCPtr(archive));
  }

  public long getFileArchiveCount() {
    return JirrJNI.IFileSystem_getFileArchiveCount(swigCPtr, this);
  }

  public boolean removeFileArchive(long index) {
    return JirrJNI.IFileSystem_removeFileArchive__SWIG_0(swigCPtr, this, index);
  }

  public boolean removeFileArchive(SWIGTYPE_p_path filename) {
    return JirrJNI.IFileSystem_removeFileArchive__SWIG_1(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
  }

  public boolean removeFileArchive(SWIGTYPE_p_IFileArchive archive) {
    return JirrJNI.IFileSystem_removeFileArchive__SWIG_2(swigCPtr, this, SWIGTYPE_p_IFileArchive.getCPtr(archive));
  }

  public boolean moveFileArchive(long sourceIndex, int relative) {
    return JirrJNI.IFileSystem_moveFileArchive(swigCPtr, this, sourceIndex, relative);
  }

  public SWIGTYPE_p_IFileArchive getFileArchive(long index) {
    long cPtr = JirrJNI.IFileSystem_getFileArchive(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_IFileArchive(cPtr, false);
  }

  public void addArchiveLoader(SWIGTYPE_p_IArchiveLoader loader) {
    JirrJNI.IFileSystem_addArchiveLoader(swigCPtr, this, SWIGTYPE_p_IArchiveLoader.getCPtr(loader));
  }

  public long getArchiveLoaderCount() {
    return JirrJNI.IFileSystem_getArchiveLoaderCount(swigCPtr, this);
  }

  public SWIGTYPE_p_IArchiveLoader getArchiveLoader(long index) {
    long cPtr = JirrJNI.IFileSystem_getArchiveLoader(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SWIGTYPE_p_IArchiveLoader(cPtr, false);
  }

  public boolean addZipFileArchive(String filename, boolean ignoreCase, boolean ignorePaths) {
    return JirrJNI.IFileSystem_addZipFileArchive__SWIG_0(swigCPtr, this, filename, ignoreCase, ignorePaths);
  }

  public boolean addZipFileArchive(String filename, boolean ignoreCase) {
    return JirrJNI.IFileSystem_addZipFileArchive__SWIG_1(swigCPtr, this, filename, ignoreCase);
  }

  public boolean addZipFileArchive(String filename) {
    return JirrJNI.IFileSystem_addZipFileArchive__SWIG_2(swigCPtr, this, filename);
  }

  public boolean addFolderFileArchive(String filename, boolean ignoreCase, boolean ignorePaths) {
    return JirrJNI.IFileSystem_addFolderFileArchive__SWIG_0(swigCPtr, this, filename, ignoreCase, ignorePaths);
  }

  public boolean addFolderFileArchive(String filename, boolean ignoreCase) {
    return JirrJNI.IFileSystem_addFolderFileArchive__SWIG_1(swigCPtr, this, filename, ignoreCase);
  }

  public boolean addFolderFileArchive(String filename) {
    return JirrJNI.IFileSystem_addFolderFileArchive__SWIG_2(swigCPtr, this, filename);
  }

  public boolean addPakFileArchive(String filename, boolean ignoreCase, boolean ignorePaths) {
    return JirrJNI.IFileSystem_addPakFileArchive__SWIG_0(swigCPtr, this, filename, ignoreCase, ignorePaths);
  }

  public boolean addPakFileArchive(String filename, boolean ignoreCase) {
    return JirrJNI.IFileSystem_addPakFileArchive__SWIG_1(swigCPtr, this, filename, ignoreCase);
  }

  public boolean addPakFileArchive(String filename) {
    return JirrJNI.IFileSystem_addPakFileArchive__SWIG_2(swigCPtr, this, filename);
  }

  public SWIGTYPE_p_path getWorkingDirectory() {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_getWorkingDirectory(swigCPtr, this), false);
  }

  public boolean changeWorkingDirectoryTo(SWIGTYPE_p_path newDirectory) {
    return JirrJNI.IFileSystem_changeWorkingDirectoryTo(swigCPtr, this, SWIGTYPE_p_path.getCPtr(newDirectory));
  }

  public SWIGTYPE_p_path getAbsolutePath(SWIGTYPE_p_path filename) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_getAbsolutePath(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename)), true);
  }

  public SWIGTYPE_p_path getFileDir(SWIGTYPE_p_path filename) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_getFileDir(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename)), true);
  }

  public SWIGTYPE_p_path getFileBasename(SWIGTYPE_p_path filename, boolean keepExtension) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_getFileBasename__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), keepExtension), true);
  }

  public SWIGTYPE_p_path getFileBasename(SWIGTYPE_p_path filename) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_getFileBasename__SWIG_1(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename)), true);
  }

  public SWIGTYPE_p_path flattenFilename(SWIGTYPE_p_path directory, SWIGTYPE_p_path root) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_flattenFilename__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(directory), SWIGTYPE_p_path.getCPtr(root)), false);
  }

  public SWIGTYPE_p_path flattenFilename(SWIGTYPE_p_path directory) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_flattenFilename__SWIG_1(swigCPtr, this, SWIGTYPE_p_path.getCPtr(directory)), false);
  }

  public SWIGTYPE_p_path getRelativeFilename(SWIGTYPE_p_path filename, SWIGTYPE_p_path directory) {
    return new SWIGTYPE_p_path(JirrJNI.IFileSystem_getRelativeFilename(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename), SWIGTYPE_p_path.getCPtr(directory)), true);
  }

  public IFileList createFileList() {
    long cPtr = JirrJNI.IFileSystem_createFileList(swigCPtr, this);
    return (cPtr == 0) ? null : new IFileList(cPtr, false);
  }

  public IFileList createEmptyFileList(String path, boolean ignoreCase, boolean ignorePaths) {
    long cPtr = JirrJNI.IFileSystem_createEmptyFileList(swigCPtr, this, CorePath.getCPtr(path), ignoreCase, ignorePaths);
    return (cPtr == 0) ? null : new IFileList(cPtr, false);
  }

  public SWIGTYPE_p_EFileSystemType setFileListSystem(SWIGTYPE_p_EFileSystemType listType) {
    return new SWIGTYPE_p_EFileSystemType(JirrJNI.IFileSystem_setFileListSystem(swigCPtr, this, SWIGTYPE_p_EFileSystemType.getCPtr(listType)), true);
  }

  public boolean existFile(SWIGTYPE_p_path filename) {
    return JirrJNI.IFileSystem_existFile(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
  }

  public SWIGTYPE_p_irr__io__IIrrXMLReaderT_wchar_t_IReferenceCounted_t createXMLReader(SWIGTYPE_p_path filename) {
    long cPtr = JirrJNI.IFileSystem_createXMLReader__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__io__IIrrXMLReaderT_wchar_t_IReferenceCounted_t(cPtr, false);
  }

  public SWIGTYPE_p_irr__io__IIrrXMLReaderT_wchar_t_IReferenceCounted_t createXMLReader(IReadFile file) {
    long cPtr = JirrJNI.IFileSystem_createXMLReader__SWIG_1(swigCPtr, this, IReadFile.getCPtr(file), file);
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__io__IIrrXMLReaderT_wchar_t_IReferenceCounted_t(cPtr, false);
  }

  public SWIGTYPE_p_irr__io__IIrrXMLReaderT_char_IReferenceCounted_t createXMLReaderUTF8(SWIGTYPE_p_path filename) {
    long cPtr = JirrJNI.IFileSystem_createXMLReaderUTF8__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__io__IIrrXMLReaderT_char_IReferenceCounted_t(cPtr, false);
  }

  public SWIGTYPE_p_irr__io__IIrrXMLReaderT_char_IReferenceCounted_t createXMLReaderUTF8(IReadFile file) {
    long cPtr = JirrJNI.IFileSystem_createXMLReaderUTF8__SWIG_1(swigCPtr, this, IReadFile.getCPtr(file), file);
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__io__IIrrXMLReaderT_char_IReferenceCounted_t(cPtr, false);
  }

  public IXMLWriter createXMLWriter(SWIGTYPE_p_path filename) {
    long cPtr = JirrJNI.IFileSystem_createXMLWriter__SWIG_0(swigCPtr, this, SWIGTYPE_p_path.getCPtr(filename));
    return (cPtr == 0) ? null : new IXMLWriter(cPtr, false);
  }

  public IXMLWriter createXMLWriter(IWriteFile file) {
    long cPtr = JirrJNI.IFileSystem_createXMLWriter__SWIG_1(swigCPtr, this, IWriteFile.getCPtr(file), file);
    return (cPtr == 0) ? null : new IXMLWriter(cPtr, false);
  }

  public IAttributes createEmptyAttributes(IVideoDriver driver) {
    long cPtr = JirrJNI.IFileSystem_createEmptyAttributes__SWIG_0(swigCPtr, this, IVideoDriver.getCPtr(driver), driver);
    return (cPtr == 0) ? null : new IAttributes(cPtr, false);
  }

  public IAttributes createEmptyAttributes() {
    long cPtr = JirrJNI.IFileSystem_createEmptyAttributes__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new IAttributes(cPtr, false);
  }

}
