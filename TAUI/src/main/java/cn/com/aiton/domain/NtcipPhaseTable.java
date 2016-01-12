package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;

@Table(name = "NtcipPhaseTable")
public class NtcipPhaseTable {

    private int id;

    private int deviceId;

    private int phaseNumber;

    private int phaseWalk;

    private int phasePedestrianClear;

    private int phaseMinimumGreen;

    private int phasePassage;

    private int phaseMaximum1;

    private int phaseMaximum2;

    private int phaseYellowChange;

    private int phaseRedClear;

    private int phaseRedRevert;

    private int phaseAddedInitial;

    private int phaseMaximumInitial;

    private int phaseTimeBeforeReduction;

    private int phaseCarsBeforeReduction;

    private int phaseTimeToReduce;

    private int phaseReduceBy;

    private int phaseMinimumGap;

    private int phaseDynamicMaxLimit;

    private int phaseDynamicMaxStep;

    private int phaseStartup;

    private int phaseOptions;

    private int phaseRing;

    private String phaseConcurrency;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getPhaseNumber() {
        return phaseNumber;
    }

    public void setPhaseNumber(int phaseNumber) {
        this.phaseNumber = phaseNumber;
    }

    public int getPhaseWalk() {
        return phaseWalk;
    }

    public void setPhaseWalk(int phaseWalk) {
        this.phaseWalk = phaseWalk;
    }

    public int getPhasePedestrianClear() {
        return phasePedestrianClear;
    }

    public void setPhasePedestrianClear(int phasePedestrianClear) {
        this.phasePedestrianClear = phasePedestrianClear;
    }

    public int getPhaseMinimumGreen() {
        return phaseMinimumGreen;
    }

    public void setPhaseMinimumGreen(int phaseMinimumGreen) {
        this.phaseMinimumGreen = phaseMinimumGreen;
    }

    public int getPhasePassage() {
        return phasePassage;
    }

    public void setPhasePassage(int phasePassage) {
        this.phasePassage = phasePassage;
    }

    public int getPhaseMaximum1() {
        return phaseMaximum1;
    }

    public void setPhaseMaximum1(int phaseMaximum1) {
        this.phaseMaximum1 = phaseMaximum1;
    }

    public int getPhaseMaximum2() {
        return phaseMaximum2;
    }

    public void setPhaseMaximum2(int phaseMaximum2) {
        this.phaseMaximum2 = phaseMaximum2;
    }

    public int getPhaseYellowChange() {
        return phaseYellowChange;
    }

    public void setPhaseYellowChange(int phaseYellowChange) {
        this.phaseYellowChange = phaseYellowChange;
    }

    public int getPhaseRedClear() {
        return phaseRedClear;
    }

    public void setPhaseRedClear(int phaseRedClear) {
        this.phaseRedClear = phaseRedClear;
    }

    public int getPhaseRedRevert() {
        return phaseRedRevert;
    }

    public void setPhaseRedRevert(int phaseRedRevert) {
        this.phaseRedRevert = phaseRedRevert;
    }

    public int getPhaseAddedInitial() {
        return phaseAddedInitial;
    }

    public void setPhaseAddedInitial(int phaseAddedInitial) {
        this.phaseAddedInitial = phaseAddedInitial;
    }

    public int getPhaseMaximumInitial() {
        return phaseMaximumInitial;
    }

    public void setPhaseMaximumInitial(int phaseMaximumInitial) {
        this.phaseMaximumInitial = phaseMaximumInitial;
    }

    public int getPhaseTimeBeforeReduction() {
        return phaseTimeBeforeReduction;
    }

    public void setPhaseTimeBeforeReduction(int phaseTimeBeforeReduction) {
        this.phaseTimeBeforeReduction = phaseTimeBeforeReduction;
    }

    public int getPhaseCarsBeforeReduction() {
        return phaseCarsBeforeReduction;
    }

    public void setPhaseCarsBeforeReduction(int phaseCarsBeforeReduction) {
        this.phaseCarsBeforeReduction = phaseCarsBeforeReduction;
    }

    public int getPhaseTimeToReduce() {
        return phaseTimeToReduce;
    }

    public void setPhaseTimeToReduce(int phaseTimeToReduce) {
        this.phaseTimeToReduce = phaseTimeToReduce;
    }

    public int getPhaseReduceBy() {
        return phaseReduceBy;
    }

    public void setPhaseReduceBy(int phaseReduceBy) {
        this.phaseReduceBy = phaseReduceBy;
    }

    public int getPhaseMinimumGap() {
        return phaseMinimumGap;
    }

    public void setPhaseMinimumGap(int phaseMinimumGap) {
        this.phaseMinimumGap = phaseMinimumGap;
    }

    public int getPhaseDynamicMaxLimit() {
        return phaseDynamicMaxLimit;
    }

    public void setPhaseDynamicMaxLimit(int phaseDynamicMaxLimit) {
        this.phaseDynamicMaxLimit = phaseDynamicMaxLimit;
    }

    public int getPhaseDynamicMaxStep() {
        return phaseDynamicMaxStep;
    }

    public void setPhaseDynamicMaxStep(int phaseDynamicMaxStep) {
        this.phaseDynamicMaxStep = phaseDynamicMaxStep;
    }

    public int getPhaseStartup() {
        return phaseStartup;
    }

    public void setPhaseStartup(int phaseStartup) {
        this.phaseStartup = phaseStartup;
    }

    public int getPhaseOptions() {
        return phaseOptions;
    }

    public void setPhaseOptions(int phaseOptions) {
        this.phaseOptions = phaseOptions;
    }

    public int getPhaseRing() {
        return phaseRing;
    }

    public void setPhaseRing(int phaseRing) {
        this.phaseRing = phaseRing;
    }

    public String getPhaseConcurrency() {
        return phaseConcurrency;
    }

    public void setPhaseConcurrency(String phaseConcurrency) {
        this.phaseConcurrency = phaseConcurrency;
    }
}
