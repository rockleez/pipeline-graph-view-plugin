package io.jenkins.plugins.pipelinegraphview;

import java.util.List;

public class PipelineStage {

    private String name;
    private List<PipelineStage> children;
    private String state; // TODO enum
    private int completePercent; // TODO int is fine?
    private String type; // TODO enum
    private String title;
    private int id; // TODO what's this for?
    private String seqContainerName;
    private final PipelineStageInternal nextSibling;
    private boolean sequential;

    public PipelineStage(
            int id,
            String name,
            List<PipelineStage> children,
            String state,
            int completePercent,
            String type,
            String title,
            String seqContainerName,
            PipelineStageInternal nextSibling,
            boolean sequential) {
        this.id = id;
        this.name = name;
        this.children = children;
        this.state = state;
        this.completePercent = completePercent;
        this.type = type;
        this.title = title;
        this.seqContainerName = seqContainerName;
        this.nextSibling = nextSibling;
        this.sequential = sequential;
    }

    public PipelineStageInternal getNextSibling() {
        return nextSibling;
    }

    // TODO clean up naming
    // HACK: blue ocean has a broken name for this 'isSequential'
    public boolean getIsSequential() {
        return sequential;
    }

    public String getSeqContainerName() {
        return seqContainerName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PipelineStage> getChildren() {
        return children;
    }

    public String getState() {
        return state;
    }

    public int getCompletePercent() {
        return completePercent;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
