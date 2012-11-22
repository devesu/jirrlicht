Unfortunately I cannot adapt this swig script to work "sit and drive". after generating it requires many fixing in generated code.
Please copy files from "patchSwig" to your swig/lib folder

and execute this command with your paths

swig -c++ -java -Id:\install\irrlicht\irrlicht-1.8\in
clude\ -package org.swig.jirr -outdir D:\temp\jirr d:\install\irrlicht\jirr\jirr
-dev\irrlicht.i

