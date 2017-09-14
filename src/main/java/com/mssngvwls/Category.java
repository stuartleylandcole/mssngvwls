package com.mssngvwls;

import java.util.List;
import java.util.UUID;

public class Category {

    private final UUID uuid = UUID.randomUUID();
    private String name;
    private List<Phrase> phrases;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((name == null) ? 0 : name.hashCode());
        result = (prime * result) + ((phrases == null) ? 0 : phrases.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (phrases == null) {
            if (other.phrases != null) {
                return false;
            }
        } else if (!phrases.equals(other.phrases)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category [uuid=" + uuid + ", name=" + name + "]";
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(final List<Phrase> phrases) {
        this.phrases = phrases;
    }

}
