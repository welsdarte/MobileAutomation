package simpleScenarioToJavaCode;

public class Visitor extends amuParserBaseVisitor<Object>{
    @Override
    public Object visitScenario(amuParser.ScenarioContext ctx) {
        return super.visitScenario(ctx);
    }

    @Override
    public Object visitHead(amuParser.HeadContext ctx) {
        return super.visitHead(ctx);
    }

    @Override
    public Object visitBody(amuParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Object visitLine(amuParser.LineContext ctx) {
        return super.visitLine(ctx);
    }

    @Override
    public Object visitAction(amuParser.ActionContext ctx) {
        return super.visitAction(ctx);
    }

    @Override
    public Object visitEnd(amuParser.EndContext ctx) {
        return super.visitEnd(ctx);
    }

    @Override
    public Object visitActionClick(amuParser.ActionClickContext ctx) {
        return super.visitActionClick(ctx);
    }

    @Override
    public Object visitActionType(amuParser.ActionTypeContext ctx) {
        return super.visitActionType(ctx);
    }

    @Override
    public Object visitActionWait(amuParser.ActionWaitContext ctx) {
        return super.visitActionWait(ctx);
    }

    @Override
    public Object visitActionScroll(amuParser.ActionScrollContext ctx) {
        return super.visitActionScroll(ctx);
    }

    @Override
    public Object visitActionSwipe(amuParser.ActionSwipeContext ctx) {
        return super.visitActionSwipe(ctx);
    }

    @Override
    public Object visitElement(amuParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public Object visitPoint(amuParser.PointContext ctx) {
        return super.visitPoint(ctx);
    }
}
