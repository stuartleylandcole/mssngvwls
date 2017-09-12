package com.mssngvwls;

public class Phrase {

    private final String fullPhrase;
    private final Category category;

    public Phrase(final String fullPhrase, final Category category) {
        this.fullPhrase = fullPhrase;
        this.category = category;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((category == null) ? 0 : category.hashCode());
        result = (prime * result) + ((fullPhrase == null) ? 0 : fullPhrase.hashCode());
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
        final Phrase other = (Phrase) obj;
        if (category == null) {
            if (other.category != null) {
                return false;
            }
        } else if (!category.equals(other.category)) {
            return false;
        }
        if (fullPhrase == null) {
            if (other.fullPhrase != null) {
                return false;
            }
        } else if (!fullPhrase.equals(other.fullPhrase)) {
            return false;
        }
        return true;
    }

    public String getFullPhrase() {
        return fullPhrase;
    }

    public Category getCategory() {
        return category;
    }
}