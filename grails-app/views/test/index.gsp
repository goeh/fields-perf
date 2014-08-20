<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>fields plugins performance test</title>
</head>

<body>
<g:form>
    <f:with bean="cmd">
        <div class="row">
            <div class="span4">
                <f:field property="s0"/>
                <f:field property="s1"/>
                <f:field property="s2"/>
                <f:field property="s3"/>
                <f:field property="s4"/>
                <f:field property="s5"/>
                <f:field property="s6"/>
                <f:field property="s7"/>
                <f:field property="s8"/>
                <f:field property="s9"/>
            </div>

            <div class="span4">
                <f:field property="i0"/>
                <f:field property="i1"/>
                <f:field property="i2"/>
                <f:field property="i3"/>
                <f:field property="i4"/>
                <f:field property="i5"/>
                <f:field property="i6"/>
                <f:field property="i7"/>
                <f:field property="i8"/>
                <f:field property="i9"/>
            </div>

            <div class="span4">
                <f:field property="b0"/>
                <f:field property="b1"/>
                <f:field property="b2"/>
                <f:field property="b3"/>
                <f:field property="b4"/>
                <f:field property="b5"/>
                <f:field property="b6"/>
                <f:field property="b7"/>
                <f:field property="b8"/>
                <f:field property="b9"/>
            </div>

        </div>
    </f:with>
</g:form>
</body>
</html>
