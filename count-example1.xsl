<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="3.0"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                exclude-result-prefixes="#all"
                expand-text="yes">

    <xsl:output method="adaptive"/>

    <xsl:mode streamable="yes"/>

    <xsl:template match="/">
        <xsl:sequence select="count(//@*)"/>
    </xsl:template>

</xsl:stylesheet>
