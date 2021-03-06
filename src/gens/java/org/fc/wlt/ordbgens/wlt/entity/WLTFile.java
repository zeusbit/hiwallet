package org.fc.wlt.ordbgens.wlt.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="WLT_FILE")
@AllArgsConstructor
@NoArgsConstructor
public class WLTFile extends WLTFileKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.FILE_PATH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String filePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.FILE_NAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.FILE_SIZE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double fileSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.FILE_HASH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String fileHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String reserved1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FILE.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String reserved2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.FILE_PATH
     *
     * @return the value of WLT_FILE.FILE_PATH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.FILE_PATH
     *
     * @param filePath the value for WLT_FILE.FILE_PATH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.FILE_NAME
     *
     * @return the value of WLT_FILE.FILE_NAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.FILE_NAME
     *
     * @param fileName the value for WLT_FILE.FILE_NAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.FILE_SIZE
     *
     * @return the value of WLT_FILE.FILE_SIZE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.FILE_SIZE
     *
     * @param fileSize the value for WLT_FILE.FILE_SIZE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.USER_ID
     *
     * @return the value of WLT_FILE.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.USER_ID
     *
     * @param userId the value for WLT_FILE.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.FILE_HASH
     *
     * @return the value of WLT_FILE.FILE_HASH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getFileHash() {
        return fileHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.FILE_HASH
     *
     * @param fileHash the value for WLT_FILE.FILE_HASH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.CREATED_TIME
     *
     * @return the value of WLT_FILE.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.CREATED_TIME
     *
     * @param createdTime the value for WLT_FILE.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.UPDATED_TIME
     *
     * @return the value of WLT_FILE.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.UPDATED_TIME
     *
     * @param updatedTime the value for WLT_FILE.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.RESERVED1
     *
     * @return the value of WLT_FILE.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.RESERVED1
     *
     * @param reserved1 the value for WLT_FILE.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FILE.RESERVED2
     *
     * @return the value of WLT_FILE.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FILE.RESERVED2
     *
     * @param reserved2 the value for WLT_FILE.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FILE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WLTFile other = (WLTFile) that;
        return (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFileHash() == null ? other.getFileHash() == null : this.getFileHash().equals(other.getFileHash()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getReserved1() == null ? other.getReserved1() == null : this.getReserved1().equals(other.getReserved1()))
            && (this.getReserved2() == null ? other.getReserved2() == null : this.getReserved2().equals(other.getReserved2()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FILE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getFileHash() == null) ? 0 : getFileHash().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getReserved1() == null) ? 0 : getReserved1().hashCode());
        result = prime * result + ((getReserved2() == null) ? 0 : getReserved2().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FILE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", filePath=").append(filePath);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", userId=").append(userId);
        sb.append(", fileHash=").append(fileHash);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append("]");
        return sb.toString();
    }
}