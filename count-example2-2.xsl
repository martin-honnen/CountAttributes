<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="3.0"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                exclude-result-prefixes="#all"
                expand-text="yes">

    <xsl:output method="text"/>

    <xsl:mode streamable="yes"/>

    <xsl:template match="/">
        <xsl:value-of select="count(//team/aussies/cricketer!copy-of()[role = 'Batsman'])"/>
    </xsl:template>

</xsl:stylesheet>
