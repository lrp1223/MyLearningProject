package com.rongpengli.designpattern._19Memento;

/**
 * 模拟运行流程A，代指某个具体流程
 *
 * @author rongpengli
 *
 */
public class FlowAMock {
    // 流程名称
    private final String flowName;
    // 中间结果
    private int tempResult;
    // 中间结果
    private String tempState;

    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }

    // 运行流程的第一个阶段
    public void runPhaseOne() {
        tempResult = 3;
        tempState = "PhaseOne";
    }

    // 按照方案一来运行流程的后半部分
    public void schema1() {
        tempState += ", Schema1";
        System.out.println(tempState + ": now run" + tempResult);
        tempResult += 11;
    }

    // 按照方案二来运行流程后半部分
    public void schema2() {
        tempState += ", Schema2";
        System.out.println(tempState + ": now run" + tempResult);
        tempResult += 22;
    }

    public FlowAMockMemento createMemento() {
        return new MementoImpl(tempResult, tempState);
    }

    public void setMemento(FlowAMockMemento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        tempResult = mementoImpl.getTempResult();
        tempState = mementoImpl.getTempState();
    }

    private static class MementoImpl implements FlowAMockMemento {
        // 保存某个中间结果
        private final int tempResult;
        // 保存某个中间结果
        private final String tempState;

        public MementoImpl(int tempResult, String tempState) {
            this.tempResult = tempResult;
            this.tempState = tempState;
        }

        public int getTempResult() {
            return tempResult;
        }

        public String getTempState() {
            return tempState;
        }
    }
}
