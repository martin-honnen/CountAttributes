package org.example.xslt3.streaming;

import net.sf.saxon.s9api.*;

import javax.xml.transform.stream.StreamSource;

public class Main {

    static Processor processor = new Processor(true);

    static XsltCompiler compiler = processor.newXsltCompiler();

    public static void main(String[] args) throws SaxonApiException {


        test("sample1.xml","count-example1.xsl");

        test("sample2.xml", "count-example2.xsl");

    }

    public static void test(String xml, String xsl) throws SaxonApiException {
        XsltExecutable executable = compiler.compile(new StreamSource(xsl));

        Xslt30Transformer transformer = executable.load30();

        XdmAtomicValue result = (XdmAtomicValue)transformer.applyTemplates(new StreamSource(xml));

        System.out.println(result.getLongValue());
    }
}
