<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head></head>
            <body>
				<h3>Relevé bancaire</h3>
                <ul>
				<li>RIB : <xsl:value-of select="releve/@RIB"/></li>
				<li>Solde : <xsl:value-of select="releve/solde"/></li>
				<li>Date : <xsl:value-of select="releve/dateReleve"/></li>
                </ul>
                <h4>
                    Les opérations effectuées du <xsl:value-of select="releve/operations/@dateDebut"/> au <xsl:value-of select="releve/operations/@dateFin"/>
                </h4>
                <table border="1" width="80%">
                    <tr>
                        <th>Type</th><th>Date</th><th>Montant</th><th>Description</th>
                    </tr>
                    <xsl:for-each select="releve/operations/operation">
                        <tr>
                            <td><xsl:value-of select="@type"/></td>
                            <td><xsl:value-of select="@date"/></td>
                            <td><xsl:value-of select="@montant"/></td>
                            <td><xsl:value-of select="@description"/></td>
                        </tr>
                    </xsl:for-each>
					<tr><td><b>Total des opérations de débit</b></td><td colspan="3"> <xsl:value-of select="sum(releve/operations/operation[@type='CREDIT']/@montant)"></xsl:value-of></td></tr>
					<tr><td><b>Total des opérations de crédit</b></td><td colspan="3"> <xsl:value-of select="sum(releve/operations/operation[@type='DEBIT']/@montant)"></xsl:value-of></td></tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>