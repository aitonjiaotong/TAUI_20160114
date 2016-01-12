package cn.com.aiton.domain;

import net.tsz.afinal.annotation.sqlite.Table;


@Table(name = "NtcipCoord")
public class NtcipCoord {

    private int id;

    private int deviceId;

    private int coordOperationalMode;

    private int coordCorrectionMode;

    private int coordMaximumMode;

    private int coordForceMode;

    private int maxPatterns;

    private int  patternTableType;

    private int patternTable;

    private int maxSplits;

    private int splitTable;

    private int coordPatternStatus;

    private int localFreeStatus;

    private int coordCycleStatus;

    private int coordSyncStatus;

    private int systemPatternControl;

    private int systemSyncControl;

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

    public int getCoordOperationalMode() {
        return coordOperationalMode;
    }

    public void setCoordOperationalMode(int coordOperationalMode) {
        this.coordOperationalMode = coordOperationalMode;
    }

    public int getCoordCorrectionMode() {
        return coordCorrectionMode;
    }

    public void setCoordCorrectionMode(int coordCorrectionMode) {
        this.coordCorrectionMode = coordCorrectionMode;
    }

    public int getCoordMaximumMode() {
        return coordMaximumMode;
    }

    public void setCoordMaximumMode(int coordMaximumMode) {
        this.coordMaximumMode = coordMaximumMode;
    }

    public int getCoordForceMode() {
        return coordForceMode;
    }

    public void setCoordForceMode(int coordForceMode) {
        this.coordForceMode = coordForceMode;
    }

    public int getMaxPatterns() {
        return maxPatterns;
    }

    public void setMaxPatterns(int maxPatterns) {
        this.maxPatterns = maxPatterns;
    }

    public int getPatternTableType() {
        return patternTableType;
    }

    public void setPatternTableType(int patternTableType) {
        this.patternTableType = patternTableType;
    }

    public int getPatternTable() {
        return patternTable;
    }

    public void setPatternTable(int patternTable) {
        this.patternTable = patternTable;
    }

    public int getMaxSplits() {
        return maxSplits;
    }

    public void setMaxSplits(int maxSplits) {
        this.maxSplits = maxSplits;
    }

    public int getSplitTable() {
        return splitTable;
    }

    public void setSplitTable(int splitTable) {
        this.splitTable = splitTable;
    }

    public int getCoordPatternStatus() {
        return coordPatternStatus;
    }

    public void setCoordPatternStatus(int coordPatternStatus) {
        this.coordPatternStatus = coordPatternStatus;
    }

    public int getLocalFreeStatus() {
        return localFreeStatus;
    }

    public void setLocalFreeStatus(int localFreeStatus) {
        this.localFreeStatus = localFreeStatus;
    }

    public int getCoordCycleStatus() {
        return coordCycleStatus;
    }

    public void setCoordCycleStatus(int coordCycleStatus) {
        this.coordCycleStatus = coordCycleStatus;
    }

    public int getCoordSyncStatus() {
        return coordSyncStatus;
    }

    public void setCoordSyncStatus(int coordSyncStatus) {
        this.coordSyncStatus = coordSyncStatus;
    }

    public int getSystemPatternControl() {
        return systemPatternControl;
    }

    public void setSystemPatternControl(int systemPatternControl) {
        this.systemPatternControl = systemPatternControl;
    }

    public int getSystemSyncControl() {
        return systemSyncControl;
    }

    public void setSystemSyncControl(int systemSyncControl) {
        this.systemSyncControl = systemSyncControl;
    }
}
