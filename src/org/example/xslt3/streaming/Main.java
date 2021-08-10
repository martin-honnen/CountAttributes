package org.example.xslt3.streaming;

import net.sf.saxon.s9api.*;

import javax.xml.transform.stream.StreamSource;

public class Main {

    public static void main(String[] args) throws SaxonApiException {
        Processor processor = new Processor(true);

        XsltCompiler compiler = processor.newXsltCompiler();

        XsltExecutable executable = compiler.compile(new StreamSource("count-example1.xsl"));

        Xslt30Transformer transformer = executable.load30();

        XdmAtomicValue result = (XdmAtomicValue)transformer.applyTemplates(new StreamSource("sample1.xml"));

        System.out.println(result.getLongValue());
    }
}
